import java.util.ArrayList;

class RootModel {

	public String topic;
	public String logo;
	public String privacy;
	public String background_image;
	public String name;
	public String state;
	public String end_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;

	public RootModel(String topic, String logo, String privacy, String background_image, String name, String state, String end_time, String description, ArrayList<Social_linksModel> social_links, String start_time, String code_of_conduct, CopyrightModel copyright, String location_name, String schedule_published_on, String email, String type, CreatorModel creator, VersionModel version, int id, String organizer_description, Call_for_papersModel call_for_papers, String timezone, String organizer_name) {

		this.topic = topic;
		this.logo = logo;
		this.privacy = privacy;
		this.background_image = background_image;
		this.name = name;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.social_links = social_links;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;

	}

}