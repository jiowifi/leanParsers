import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_description;
	public String email;
	public VersionModel _version;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String state;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public String type;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String timezone;
	public String logo;
	public String organizer_name;
	public String topic;

	public RootModel(String location_name, String organizer_description, String email, VersionModel version, String schedule_published_on, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String background_image, String state, String end_time, Call_for_papersModel call_for_papers, int id, String privacy, String code_of_conduct, String start_time, String type, String name, CreatorModel creator, String description, String timezone, String logo, String organizer_name, String topic) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.social_links = social_links;
		this.background_image = background_image;
		this.state = state;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.type = type;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}