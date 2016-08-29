import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String timezone;
	public String topic;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public String location_name;
	public String type;
	public VersionModel _version;
	public String description;
	public String code_of_conduct;
	public String email;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public String organizer_name;

	public RootModel(String schedule_published_on, String logo, String end_time, Call_for_papersModel call_for_papers, String state, String timezone, String topic, CopyrightModel copyright, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, String start_time, String name, String location_name, String type, VersionModel version, String description, String code_of_conduct, String email, String organizer_description, String background_image, String privacy, String organizer_name) {

		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.timezone = timezone;
		this.topic = topic;
		this._copyright = copyright;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this.location_name = location_name;
		this.type = type;
		this._version = version;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_name = organizer_name;

	}

}