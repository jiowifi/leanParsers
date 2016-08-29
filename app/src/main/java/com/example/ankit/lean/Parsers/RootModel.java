import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String name;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public String logo;
	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_description;
	public VersionModel _version;
	public String description;
	public String organizer_name;
	public String email;
	public int id;
	public String privacy;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String timezone, String name, String topic, CopyrightModel copyright, String location_name, String logo, String background_image, String code_of_conduct, CreatorModel creator, String organizer_description, VersionModel version, String description, String organizer_name, String email, int id, String privacy, String start_time, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String type, ArrayList<Social_linksModel> social_links, String state) {

		this.timezone = timezone;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.logo = logo;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._version = version;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.id = id;
		this.privacy = privacy;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this.state = state;

	}

}