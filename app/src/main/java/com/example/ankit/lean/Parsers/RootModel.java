import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String email;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public int id;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public String description;
	public String logo;
	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String code_of_conduct;
	public String type;
	public String end_time;

	public RootModel(String location_name, String email, String timezone, String organizer_description, CopyrightModel copyright, String start_time, String state, int id, String privacy, Call_for_papersModel call_for_papers, VersionModel version, String background_image, String description, String logo, String organizer_name, CreatorModel creator, String topic, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String code_of_conduct, String type, String end_time) {

		this.location_name = location_name;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.id = id;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this.description = description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.end_time = end_time;

	}

}