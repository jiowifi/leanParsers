import java.util.ArrayList;

class RootModel {

	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String end_time;
	public String schedule_published_on;
	public String description;
	public String name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String background_image;
	public VersionModel _version;
	public String organizer_name;
	public String code_of_conduct;
	public String state;
	public int id;
	public String organizer_description;
	public String start_time;
	public String type;
	public CreatorModel _creator;
	public String timezone;
	public String email;
	public String topic;

	public RootModel(String location_name, Call_for_papersModel call_for_papers, String logo, String end_time, String schedule_published_on, String description, String name, String privacy, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String background_image, VersionModel version, String organizer_name, String code_of_conduct, String state, int id, String organizer_description, String start_time, String type, CreatorModel creator, String timezone, String email, String topic) {

		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.name = name;
		this.privacy = privacy;
		this.social_links = social_links;
		this._copyright = copyright;
		this.background_image = background_image;
		this._version = version;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.id = id;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.type = type;
		this._creator = creator;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;

	}

}