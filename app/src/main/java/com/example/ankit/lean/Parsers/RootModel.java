import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public String logo;
	public String organizer_name;
	public String organizer_description;
	public String start_time;
	public String privacy;
	public String topic;
	public String location_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CreatorModel _creator;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public String description;
	public String timezone;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(int id, String type, String logo, String organizer_name, String organizer_description, String start_time, String privacy, String topic, String location_name, String background_image, CopyrightModel copyright, String name, ArrayList<Social_linksModel> social_links, String state, CreatorModel creator, String schedule_published_on, VersionModel version, String end_time, String description, String timezone, String code_of_conduct, Call_for_papersModel call_for_papers, String email) {

		this.id = id;
		this.type = type;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.privacy = privacy;
		this.topic = topic;
		this.location_name = location_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.name = name;
		this.social_links = social_links;
		this.state = state;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this.description = description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}