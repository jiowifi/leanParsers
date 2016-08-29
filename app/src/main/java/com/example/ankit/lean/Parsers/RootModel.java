import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String name;
	public String end_time;
	public String schedule_published_on;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public CreatorModel _creator;
	public String logo;
	public String description;
	public int id;
	public String start_time;
	public String organizer_description;
	public String timezone;
	public String email;
	public String location_name;

	public RootModel(String privacy, String name, String end_time, String schedule_published_on, String type, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String organizer_name, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String topic, String state, CreatorModel creator, String logo, String description, int id, String start_time, String organizer_description, String timezone, String email, String location_name) {

		this.privacy = privacy;
		this.name = name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this._creator = creator;
		this.logo = logo;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this.location_name = location_name;

	}

}