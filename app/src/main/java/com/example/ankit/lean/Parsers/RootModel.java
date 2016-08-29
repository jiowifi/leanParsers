import java.util.ArrayList;

class RootModel {

	public String name;
	public String type;
	public String privacy;
	public String logo;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public String end_time;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public String schedule_published_on;
	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public String topic;
	public String code_of_conduct;

	public RootModel(String name, String type, String privacy, String logo, VersionModel version, Call_for_papersModel call_for_papers, String email, int id, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, String end_time, CreatorModel creator, String start_time, String organizer_name, String schedule_published_on, String location_name, String state, CopyrightModel copyright, String background_image, String description, String topic, String code_of_conduct) {

		this.name = name;
		this.type = type;
		this.privacy = privacy;
		this.logo = logo;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.end_time = end_time;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;

	}

}