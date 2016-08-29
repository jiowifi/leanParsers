import java.util.ArrayList;

class RootModel {

	public String email;
	public VersionModel _version;
	public String description;
	public int id;
	public String location_name;
	public CreatorModel _creator;
	public String start_time;
	public String schedule_published_on;
	public String organizer_description;
	public String background_image;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;

	public RootModel(String email, VersionModel version, String description, int id, String location_name, CreatorModel creator, String start_time, String schedule_published_on, String organizer_description, String background_image, String name, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String timezone, String state, String logo, CopyrightModel copyright, String end_time, String privacy, ArrayList<Social_linksModel> social_links, String topic, String type) {

		this.email = email;
		this._version = version;
		this.description = description;
		this.id = id;
		this.location_name = location_name;
		this._creator = creator;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.privacy = privacy;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;

	}

}