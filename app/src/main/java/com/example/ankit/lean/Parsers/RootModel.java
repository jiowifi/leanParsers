import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String email;
	public String logo;
	public String state;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String end_time;
	public String type;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public int id;
	public String background_image;
	public String timezone;
	public String privacy;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String start_time, String email, String logo, String state, String organizer_description, String location_name, String organizer_name, String end_time, String type, String code_of_conduct, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String topic, int id, String background_image, String timezone, String privacy, String schedule_published_on, CopyrightModel copyright, String description, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.id = id;
		this.background_image = background_image;
		this.timezone = timezone;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;
		this._version = version;

	}

}