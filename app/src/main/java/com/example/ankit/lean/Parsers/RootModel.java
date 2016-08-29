import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public String state;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String timezone;
	public int id;
	public String name;
	public String type;
	public String code_of_conduct;
	public String schedule_published_on;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String end_time;
	public String background_image;
	public String start_time;
	public String logo;

	public RootModel(String organizer_description, String privacy, String state, CreatorModel creator, String email, VersionModel version, String organizer_name, String timezone, int id, String name, String type, String code_of_conduct, String schedule_published_on, String description, ArrayList<Social_linksModel> social_links, String topic, CopyrightModel copyright, Call_for_papersModel call_for_papers, String location_name, String end_time, String background_image, String start_time, String logo) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.state = state;
		this._creator = creator;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.social_links = social_links;
		this.topic = topic;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.end_time = end_time;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;

	}

}