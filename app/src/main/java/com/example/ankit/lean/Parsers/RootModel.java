import java.util.ArrayList;

class RootModel {

	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public int id;
	public String email;
	public String code_of_conduct;
	public String type;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String description;
	public String privacy;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public CopyrightModel _copyright;
	public String start_time;
	public String logo;
	public String timezone;
	public String location_name;

	public RootModel(String state, VersionModel version, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_description, int id, String email, String code_of_conduct, String type, String end_time, CreatorModel creator, String organizer_name, String name, String description, String privacy, String topic, String schedule_published_on, String background_image, CopyrightModel copyright, String start_time, String logo, String timezone, String location_name) {

		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._copyright = copyright;
		this.start_time = start_time;
		this.logo = logo;
		this.timezone = timezone;
		this.location_name = location_name;

	}

}