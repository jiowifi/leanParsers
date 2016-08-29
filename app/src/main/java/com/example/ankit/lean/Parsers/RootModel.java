import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public String logo;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String start_time;
	public String description;
	public String topic;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public String privacy;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String end_time;
	public String location_name;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, int id, Call_for_papersModel call_for_papers, String timezone, String name, String background_image, String code_of_conduct, String logo, CreatorModel creator, String schedule_published_on, String start_time, String description, String topic, CopyrightModel copyright, String type, String organizer_description, String privacy, String email, VersionModel version, String organizer_name, String end_time, String location_name) {

		this.state = state;
		this.social_links = social_links;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}