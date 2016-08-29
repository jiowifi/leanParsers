import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public VersionModel _version;
	public String background_image;
	public String end_time;
	public int id;
	public String state;
	public String location_name;
	public String start_time;
	public String privacy;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String type;
	public String code_of_conduct;
	public String logo;
	public CopyrightModel _copyright;
	public String email;
	public String name;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(String schedule_published_on, CreatorModel creator, VersionModel version, String background_image, String end_time, int id, String state, String location_name, String start_time, String privacy, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, String type, String code_of_conduct, String logo, CopyrightModel copyright, String email, String name, String organizer_name, String description, Call_for_papersModel call_for_papers, String topic) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._version = version;
		this.background_image = background_image;
		this.end_time = end_time;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this.start_time = start_time;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._copyright = copyright;
		this.email = email;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}