import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public VersionModel _version;
	public String timezone;
	public String end_time;
	public String location_name;
	public String logo;
	public String topic;
	public String type;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String background_image;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String name;
	public String organizer_name;
	public String privacy;
	public int id;
	public String state;

	public RootModel(Call_for_papersModel call_for_papers, String email, String description, VersionModel version, String timezone, String end_time, String location_name, String logo, String topic, String type, CreatorModel creator, String code_of_conduct, String background_image, String schedule_published_on, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String name, String organizer_name, String privacy, int id, String state) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this._version = version;
		this.timezone = timezone;
		this.end_time = end_time;
		this.location_name = location_name;
		this.logo = logo;
		this.topic = topic;
		this.type = type;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.id = id;
		this.state = state;

	}

}